package com.qingshop.mall.modules.job.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qingshop.mall.modules.job.entity.SysJobLog;

/**
 * <p>
 * 定时任务调度日志表 服务类
 * </p>
 *
 * @author lich
 * @since 2019-10-16
 */
public interface ISysJobLogService extends IService<SysJobLog> {

	void addJobLog(SysJobLog jobLog);

	void deleteJobByIds(String ids);

	void cleanJobLog();

}
