package com.fashiondigital.PoliticalSpeeches.model;

import com.opencsv.bean.CsvBindByPosition;
import lombok.*;
import org.springframework.validation.annotation.Validated;

@Getter
@Setter
@Validated
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PoliticalInformation {
    @CsvBindByPosition(position = 0)
    private String speakerName;

    @CsvBindByPosition(position = 1)
    private String speakerTopic;

    @CsvBindByPosition(position = 2)
    private String dateOfSpeech;

    @CsvBindByPosition(position = 3)
    private String numberOfWordsSpoken;

}
