package com.springboot.myfirstapp.rest;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.*;
import com.springboot.myfirstapp.rest.Item;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.util.*;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private  ArrayList<Item> items= new ArrayList<>();

    //retrieve all items
    @GetMapping
    public ResponseEntity<Map<String, Object>> getAllItems(){
        Map<String, Object> response=new HashMap<>();
        response.put("Message", "Items Fetched sucessfully!");
        response.put("Items", items);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    // Get item by id
    @GetMapping("/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable("id") int id){
        Item result=items.stream().filter(i->i.getId()==id).findFirst().orElse(null);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    //POST- Create a new item
    @PostMapping
    public ResponseEntity<Map<String, Object>> putItem(@RequestBody Item item){
        items.add(item);
        Map<String, Object> response=new HashMap<>();
        response.put("Message", "Item added successfully!");
        response.put("All items", items);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    //Update an item
    @PutMapping("/update/{id}")
    public ResponseEntity<Map<String, Object>> updateItem(@PathVariable int id, @RequestBody Item item){
        Item existingItem=items.stream().filter(i->i.getId()==id).findFirst().orElse(null);
        Map<String, Object> response=new HashMap<>();
        if (existingItem!=null){
            existingItem.setName(item.getName());
            existingItem.setDescription(item.getDescription());
            response.put("Message", "Item updated successfully!");
            response.put("All items", items);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        else{
            response.put("Message", "No item found with the id "+id);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
    }

    //Delete an item
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteItem(@PathVariable("id") int id) {
        items.removeIf(item -> item.getId() == id);
        return new ResponseEntity<>("Item deleted successfully!", HttpStatus.OK);
    }
}
