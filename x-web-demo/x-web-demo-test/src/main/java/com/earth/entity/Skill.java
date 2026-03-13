package com.earth.entity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 *
 * </p>
 *
 * @author zhx
 * @since 2024-09-04
 */
@Getter
@Setter
public class Skill implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userId;

    /**
     * mode是名称Robot、LandBlock
     */
    private String mode;

    /**
     * modelId是模型表的ID
     */
    private String modelId;

    private String sort;

    private String icon;


}
