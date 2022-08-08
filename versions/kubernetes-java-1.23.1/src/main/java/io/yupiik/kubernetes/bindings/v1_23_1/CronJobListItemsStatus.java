package io.yupiik.kubernetes.bindings.v1_23_1;

import java.util.List;
import java.util.Objects;

public class CronJobListItemsStatus {
    private List<CronJobListItemsStatusActive> active;
    private String lastScheduleTime;
    private String lastSuccessfulTime;

    public CronJobListItemsStatus() {
        // no-op
    }

    public CronJobListItemsStatus(final List<CronJobListItemsStatusActive> active,
                                  final String lastScheduleTime,
                                  final String lastSuccessfulTime) {
        // no-op
    }

    public List<CronJobListItemsStatusActive> getActive() {
        return active;
    }

    public void setActive(final List<CronJobListItemsStatusActive> active) {
        this.active = active;
    }

    public String getLastScheduleTime() {
        return lastScheduleTime;
    }

    public void setLastScheduleTime(final String lastScheduleTime) {
        this.lastScheduleTime = lastScheduleTime;
    }

    public String getLastSuccessfulTime() {
        return lastSuccessfulTime;
    }

    public void setLastSuccessfulTime(final String lastSuccessfulTime) {
        this.lastSuccessfulTime = lastSuccessfulTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                active,
                lastScheduleTime,
                lastSuccessfulTime);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobListItemsStatus)) {
            return false;
        }
        final CronJobListItemsStatus __otherCasted = (CronJobListItemsStatus) __other;
        return Objects.equals(active, __otherCasted.active) &&
            Objects.equals(lastScheduleTime, __otherCasted.lastScheduleTime) &&
            Objects.equals(lastSuccessfulTime, __otherCasted.lastSuccessfulTime);
    }
}
