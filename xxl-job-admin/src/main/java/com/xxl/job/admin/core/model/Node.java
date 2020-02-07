package com.xxl.job.admin.core.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * KX00_ZGJS_JSJD
 * @author 
 */
@Data
public class Node implements Serializable {
    private Long XH;

    private String MC;

    private String DZ;

    private Short ZT;

    private Date CJSJ;

    private Date GXSJ;

    private static final long serialVersionUID = 1L;
}