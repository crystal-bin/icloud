package com.icloud.front.juhuasuan.bussiness;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.icloud.framework.core.wrapper.Pagination;
import com.icloud.framework.picture.TZPhotoUtil;
import com.icloud.framework.util.ExcelIEUtil;
import com.icloud.framework.util.ICloudUtils;
import com.icloud.framework.vo.KeyValue;
import com.icloud.front.juhusuan.pojo.JuhuasuanFrontSession;
import com.icloud.front.stock.StockBussinessTest;
import com.icloud.stock.model.JuhuasuanUrl;
import com.icloud.stock.model.User;
import com.icloud.user.bussiness.po.AllUserPo;
import com.icloud.user.bussiness.po.ChildrenUserPo;
import com.icloud.user.bussiness.po.UserInfoPo;

/**
 * @comment
 * @author 崔江宁
 * @email cuijiangning@cninfo.com.cn 2014年10月10日 下午2:28:18
 */
public class JuhuasuanBussinessTest extends StockBussinessTest {
	String path = "/data/test/icloud/t.xls";

	@Test
	public void getXls() {
		JuhuasuanUrl urlBean = new JuhuasuanUrl();
		urlBean.setUserId(1);
		List<JuhuasuanUrl> urls = this.juhuasuanBussiness
				.searchAllJuhuasuanUrl(urlBean);
		logger.info("----------start----------");
		for (JuhuasuanUrl url : urls) {
			logger.info("urlname:{},taobaoUrl:{}", url.getName(),
					url.getTaobaoUrl());
		}
		logger.info("count={}", urls.size());
		logger.info("----------end----------");
		logger.info("----------start to 生成xls----------");
		List<KeyValue<String, String>> list = new ArrayList<KeyValue<String, String>>();
		// list.add(new KeyValue<String, String>("id", "Id"));
		list.add(new KeyValue<String, String>("icloudUrl", "本地代码"));
		// list.add(new KeyValue<String, String>("userId", "用户ID"));

		list.add(new KeyValue<String, String>("name", "链接名"));
		list.add(new KeyValue<String, String>("taobaoUrl", "淘宝url"));
		list.add(new KeyValue<String, String>("desText", "描述"));
		// list.add(new KeyValue<String, String>("status", "状态"));
		// list.add(new KeyValue<String, String>("type", "类型"));
		// list.add(new KeyValue<String, String>("solidify", "加固方式"));
		list.add(new KeyValue<String, String>("originUrl", "原始链接"));

		byte[] bytes = ExcelIEUtil.exportBytes(list, urls);
		TZPhotoUtil.storeToFile(path, bytes);
		logger.info("----------end to 生成xls----------");
	}

	@Test
	public void saveForUpdateXls() throws Exception {
		Map<String, String> fieldMap = new HashMap<String, String>();
		// fieldMap.put("Id", "id");
		fieldMap.put("本地代码", "icloudUrl");
		// fieldMap.put("用户ID", "userId");
		fieldMap.put("链接名", "name");
		fieldMap.put("淘宝url", "taobaoUrl");
		fieldMap.put("描述", "desText");
		// fieldMap.put("状态", "status");
		// fieldMap.put("类型", "type");
		// fieldMap.put("加固方式", "solidify");
		fieldMap.put("原始链接", "originUrl");

		List<JuhuasuanUrl> list = ExcelIEUtil.importFromExcel(
				JuhuasuanUrl.class, fieldMap, path);
		// System.out.println("list.size:" +list.size());
		// for (JuhuasuanUrl url : list) {
		// System.out.println(url.toString());
		// }
		String result = this.juhuasuanBussiness.batchUpdateUrl(list, 1);
		System.out.println(result);
		// }

	}

	@Test
	public void getSession() {
		Pagination<JuhuasuanFrontSession> pagination = this.juhuasuanBussiness
				.getJuhuaSessionByUserId(1, 0, 2);
		Collection<JuhuasuanFrontSession> data = pagination.getData();
		for (JuhuasuanFrontSession session : data) {
			System.out.println(session.toString());
		}
	}

	@Test
	public void getAllUsers() {
		AllUserPo userPo = this.juhuasuanStatBusiness.getAllUserPo();
		User nextUser = userPo.next();
		while (ICloudUtils.isNotNull(nextUser)) {
			System.out.println(nextUser.getChinaName());
			nextUser = userPo.next();
		}
	}

	@Test
	public void updateDetailValid() {
		this.juhuasuanBussiness.updateAllJuhuasuanDetail();
	}

	@Test
	public void updateUserUrlAccessCountDaily() {
		this.juhuasuanStatBusiness.updateUserUrlAccessCountDaily();
	}

	@Test
	public void getChildren() {
		User user = userAdminBusiness.getUser(2);
		ChildrenUserPo userPo = userAdminBusiness.getChildrenUserPo(user);
		System.out.println("-=---");
		List<UserInfoPo> allUserList = userPo.getAllUser();
		for (UserInfoPo po : allUserList) {
			System.out.println(po.getUserId());
		}
	}
}
