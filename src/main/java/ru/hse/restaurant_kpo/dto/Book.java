package ru.hse.restaurant_kpo.dto;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.UUID;
@Data
@Getter
@Builder
public class Book {
    private UUID id;
    private String name;
    private String summary;

    public void setId(UUID id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
}
