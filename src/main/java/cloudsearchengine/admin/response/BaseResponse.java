package cloudsearchengine.admin.response;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "BaseResponse对象", description = "")
public class BaseResponse<T> {
    private Integer code;
    private String message;
    private T data;
}
