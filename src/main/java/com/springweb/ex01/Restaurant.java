package com.springweb.ex01;

import lombok.Data;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Restaurant {
//    onmethod는 추후에 자동으로 생성되는 setter가 오토와이어드가 필요하다는 뜻이다
    @Setter(onMethod_ =@Autowired)
    private Chef chef;

}
