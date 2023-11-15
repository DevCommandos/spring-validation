package ez.springvalidation.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ReqDtoV2 {

    @NotBlank(message = "빈칸이면 안돼요")
    private String notBlankValue;

    @NotNull(message = "널이면 안돼요")
    private String notNullValue;

    @NotNull
    @Range(min = 19, max = 50, message = "19에서 50만 가능") // 19 ~ 50가능
    private Integer age;

    @NotNull //널이면 안돼요
    @Max(value = 1000, message = "1000넘지마시오.") // 최대 1000
    private Integer qty;
}
