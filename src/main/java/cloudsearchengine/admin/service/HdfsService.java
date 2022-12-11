package cloudsearchengine.admin.service;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class HdfsService {
    @Value("${hdfs.path}")
    private String hdfsPath;

    @Value("${hdfs.user}")
    private String user;

    public Configuration getConfiguration() throws IOException {
        Configuration configuration = new Configuration();
        configuration.set("fs.defaultFS", hdfsPath);
        return configuration;
    }

}
