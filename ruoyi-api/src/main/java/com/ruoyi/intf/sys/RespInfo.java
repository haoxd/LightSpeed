package com.ruoyi.intf.sys;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.Date;



@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class RespInfo<T> implements Serializable {


    private static final long serialVersionUID = 1L;
    private String respCode;
    private String respDesc;
    private String time = new DateTime(new Date().getTime()).toString("yyyyMMddHHmmssSSS");
    private Object data;

}