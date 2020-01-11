package FrameWork.Bean;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by forget on 2019/7/10.
 */
@Document("Authority")
public class Authority extends BaseEntity{

    private String authorityName;

}
