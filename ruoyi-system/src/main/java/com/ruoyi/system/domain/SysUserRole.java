package com.ruoyi.system.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 用户和角色关联 sys_user_role
 * 
 * @author ruoyi haoxd 
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain=true)
public class SysUserRole
{
    /** 用户ID */
    private Long userId;
    
    /** 角色ID */
    private Long roleId;

   
}
