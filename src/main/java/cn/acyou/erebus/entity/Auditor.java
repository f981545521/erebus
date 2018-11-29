package cn.acyou.erebus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import com.sun.istack.internal.NotNull;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

public class Auditor implements Serializable {
    private static final long serialVersionUID = -1867143858454977937L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private BigInteger id;

    /**
     * 元素名称
     */
    @NotNull
    private String name;

    /**
     * 描述信息
     */
    private String description;

    /**
     * 是否删除: 0-否 1-是，默认0-否
     */
    @TableLogic
    private Integer deleted;

    /**
     * 版本号
     */
    @NotNull
    @Version
    private Integer version;

    /**
     * 创建人
     */
    private BigInteger createUser;

    /**
     * 创建时间,默认当前时间
     */
    @NotNull
    private Date createTime;

    /**
     * 最后修改人
     */
    private BigInteger lastUpdateUser;

    /**
     * 最后修改时间
     */
    private Date lastUpdateTime;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(BigInteger id) {
        this.id = id;
    }

    /**
     * 获取元素名称
     *
     * @return name - 元素名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置元素名称
     *
     * @param name 元素名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取描述信息
     *
     * @return description - 描述信息
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述信息
     *
     * @param description 描述信息
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取是否删除: 0-否 1-是，默认0-否
     *
     * @return deleted - 是否删除: 0-否 1-是，默认0-否
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * 设置是否删除: 0-否 1-是，默认0-否
     *
     * @param deleted 是否删除: 0-否 1-是，默认0-否
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * 获取版本号
     *
     * @return version - 版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 获取创建人
     *
     * @return create_user - 创建人
     */
    public BigInteger getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人
     *
     * @param createUser 创建人
     */
    public void setCreateUser(BigInteger createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取创建时间,默认当前时间
     *
     * @return create_time - 创建时间,默认当前时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间,默认当前时间
     *
     * @param createTime 创建时间,默认当前时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取最后修改人
     *
     * @return last_update_user - 最后修改人
     */
    public BigInteger getLastUpdateUser() {
        return lastUpdateUser;
    }

    /**
     * 设置最后修改人
     *
     * @param lastUpdateUser 最后修改人
     */
    public void setLastUpdateUser(BigInteger lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    /**
     * 获取最后修改时间
     *
     * @return last_update_time - 最后修改时间
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 设置最后修改时间
     *
     * @param lastUpdateTime 最后修改时间
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Auditor{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", deleted=").append(deleted);
        sb.append(", version=").append(version);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateUser=").append(lastUpdateUser);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append('}');
        return sb.toString();
    }
}