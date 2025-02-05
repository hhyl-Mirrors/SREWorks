package com.alibaba.tesla.appmanager.domain.req;

import com.alibaba.tesla.appmanager.common.enums.ComponentTypeEnum;
import com.alibaba.tesla.appmanager.domain.dto.ContainerObjectDTO;
import com.alibaba.tesla.appmanager.domain.dto.EnvMetaDTO;
import com.alibaba.tesla.appmanager.domain.dto.ImagePushDTO;
import lombok.Data;

import java.util.List;

/**
 * K8S 微服务元数据变更请求
 *
 * @author qianmo.zm@alibaba-inc.com
 */
@Data
public class K8sMicroServiceMetaUpdateReq {

    /**
     * 主键 ID
     */
    @Deprecated
    private Long id;

    /**
     * 应用标示
     */
    @Deprecated
    private String appId;

    /**
     * Namespace ID
     */
    private String namespaceId;

    /**
     * Stage ID
     */
    private String stageId;

    /**
     * 微服务标示
     */
    private String microServiceId;

    /**
     * 微服务名称
     */
    private String name;

    /**
     * 描述信息
     */
    private String description;

    /**
     * 组件类型
     */
    private ComponentTypeEnum componentType;

    /**
     * 架构
     */
    private String arch;

    /**
     * 容器对象
     */
    private List<ContainerObjectDTO> containerObjectList;

    /**
     * 环境变量定义
     */
    private List<EnvMetaDTO> envList;

    /**
     * 镜像推送配置
     */
    private ImagePushDTO imagePushObject;
}
