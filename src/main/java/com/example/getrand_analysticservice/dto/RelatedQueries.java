package com.example.getrand_analysticservice.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "related_queries")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RelatedQueries extends PublicInfo{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String query;
    private String value;
    private int extractedValue;
}