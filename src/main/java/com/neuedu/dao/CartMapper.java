package com.neuedu.dao;

import com.neuedu.pojo.Cart;
import com.neuedu.pojo.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_cart
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_cart
     *
     * @mbggenerated
     */
    int insert(Cart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_cart
     *
     * @mbggenerated
     */
    Cart selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_cart
     *
     * @mbggenerated
     */
    List<Cart> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_cart
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Cart record);

    /*查询用户对应购物信息*/
    List<Cart> selectByUID(Integer uid);

    /*根据商品ID查询单条信息*/
    Cart selectByUidAndProductId(@Param("uid") Integer uid, @Param("productId") Integer productId);

    /*移除选中的商品*/
    int deleteByUidAndproductId(@Param("uid") Integer uid, @Param("productId") Integer productId);

    /*查询用户对应购物信息以选中的*/
    List<Cart> selectByUidAndCheckIn(Integer uid);
}