package com.pinyougou.sellergoods.service;
import java.util.List;
import com.pinyougou.pojo.TbGoods;

import com.pinyougou.pojo.TbItem;
import com.pinyougou.pojogroup.Goods;
import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface GoodsService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbGoods> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Goods goods);
	
	
	/**
	 * 修改
	 */
	public void update(Goods goods);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Goods findOne(Long id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbGoods goods, int pageNum, int pageSize);

	/**
	 * 修改商品状态
	 * @param ids id数组
	 * @param status 状态 0未审核 1 通过 2未通过 3删除
	 */
	void updateStatus(Long[] ids ,String status);

	/**
	 * 商品上下架
	 * @param ids id数组
	 * @param marketable 1上架 0下架
	 */
	void updateIsMarketables(Long[] ids, String marketable);

	/**
	 * 根据spu id数组查询sku列表集合
	 * @param ids id数组
	 * @param status 状态 0未审核 1 通过 2未通过 3删除
	 * @return
	 */
	List<TbItem> findItemListByGoodsIdsAndStutas(Long[] ids,String status);
}
