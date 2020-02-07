package com.xxl.job.admin.core.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * KX00_ZGJS_ZXQZY
 * @author 
 */
@Data
public class JobHandler implements Serializable {
    private Long XH;

    private String MC;

    private String MS;

    private Date CJSJ;

    private Date GXSJ;

    private static final long serialVersionUID = 1L;
}