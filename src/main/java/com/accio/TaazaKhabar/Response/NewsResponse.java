package com.accio.TaazaKhabar.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

//we have made this class to show customised response of API we are defining in this class which attributes
//we want to display and we will return this class.
public class NewsResponse {
    String status;
    List<NewsResponseList> articles;
}
