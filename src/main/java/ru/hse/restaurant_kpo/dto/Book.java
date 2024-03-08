package ru.hse.restaurant_kpo.dto;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
@Builder
public class Book {
    private UUID id;
    private String name;
    private String summary;

    public void setId(UUID id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setSummary(String summary)
    {
        this.summary = summary;
    }
}
