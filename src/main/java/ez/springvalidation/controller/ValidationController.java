package ez.springvalidation.controller;

import ez.springvalidation.dto.ReqDto;
import ez.springvalidation.dto.ReqDtoV2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ValidationController {

    @GetMapping("/v1/validation")
    public ReqDto testV1(ReqDto reqDto){
        //타입이 안맞으면 진입 불가
        return reqDto;
    }

    @GetMapping("/v2/validation")
    public ReqDto testV1(ReqDto reqDto, BindingResult bindingResult){
        //타입이 안맞아도 진입 가능, 타입이 안맞는 것은 초기값으로 들어가 있음.
        //ReqDto reqDto, BindingResult bindingResult  파라미터 순서가 중요하다.
        //bindingResult 는 view에 같이 넘어간다. (타임리프 사용하면 편리함)
        return reqDto;
    }

    @GetMapping("/v1/dto-v2")
    public void testV2(@Validated ReqDtoV2 reqDtoV2){
        log.info("reqDtoV2 : {}", reqDtoV2);
    }

}
