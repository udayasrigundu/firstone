/**
 *
 */
package com.otm.otmtraining.core.cronjobs;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import org.apache.log4j.Logger;

import com.otm.otmtraining.core.model.FirstCronJobModel;


/**
 * @author Greeshma
 *
 */
public class FirstJob extends AbstractJobPerformable<FirstCronJobModel>
{
	private static final Logger LOG = Logger.getLogger(FirstJob.class);
	@Override
	public PerformResult perform(final FirstCronJobModel cronJobModel)
	{

		final String userName = cronJobModel.getUserName();

			LOG.info(userName + "hello");

			return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
		//register this job in core-spring.xml file
	}
}
