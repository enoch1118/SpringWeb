package com.springWeb.ex01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@AllArgsConstructor
public class SampleHotel {

    private Chef chef;
}
