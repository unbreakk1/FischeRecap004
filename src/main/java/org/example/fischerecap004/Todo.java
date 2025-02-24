package org.example.fischerecap004;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "todos") // MongoDB collection name
public class Todo
{
    @Id
    private String id; // Use String for MongoDB IDs
    private String title;
    private String description;
    private boolean completed;
}

