package cloudsearchengine.admin.controller;

import cloudsearchengine.admin.response.BaseResponse;
import cloudsearchengine.admin.service.HdfsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;

@RestController
@RequestMapping("/test/hdfs")
public class HdfsController {
    @Resource
    private HdfsService hdfsService;

    @GetMapping("get_config")
    public BaseResponse<String> getConfig() throws IOException {
        return new BaseResponse<String>(200, "OK", hdfsService.getConfiguration().toString());
    }
}
