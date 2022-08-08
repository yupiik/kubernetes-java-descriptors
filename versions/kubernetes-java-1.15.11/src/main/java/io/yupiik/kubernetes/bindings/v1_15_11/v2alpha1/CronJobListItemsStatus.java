package io.yupiik.kubernetes.bindings.v1_15_11.v2alpha1;

import java.util.List;
import java.util.Objects;

public class CronJobListItemsStatus {
    private List<CronJobListItemsStatusActive> active;
    private String lastScheduleTime;

    public CronJobListItemsStatus() {
        // no-op
    }

    public CronJobListItemsStatus(final List<CronJobListItemsStatusActive> active,
                                  final String lastScheduleTime) {
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

    @Override
    public int hashCode() {
        return Objects.hash(
                active,
                lastScheduleTime);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobListItemsStatus)) {
            return false;
        }
        final CronJobListItemsStatus __otherCasted = (CronJobListItemsStatus) __other;
        return Objects.equals(active, __otherCasted.active) &&
            Objects.equals(lastScheduleTime, __otherCasted.lastScheduleTime);
    }
}
