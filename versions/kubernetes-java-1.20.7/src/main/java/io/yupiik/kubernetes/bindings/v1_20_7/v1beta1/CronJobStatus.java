package io.yupiik.kubernetes.bindings.v1_20_7.v1beta1;

import java.util.List;
import java.util.Objects;

public class CronJobStatus {
    private List<CronJobStatusActive> active;
    private String lastScheduleTime;

    public CronJobStatus() {
        // no-op
    }

    public CronJobStatus(final List<CronJobStatusActive> active,
                         final String lastScheduleTime) {
        // no-op
    }

    public List<CronJobStatusActive> getActive() {
        return active;
    }

    public void setActive(final List<CronJobStatusActive> active) {
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
        if (!(__other instanceof CronJobStatus)) {
            return false;
        }
        final CronJobStatus __otherCasted = (CronJobStatus) __other;
        return Objects.equals(active, __otherCasted.active) &&
            Objects.equals(lastScheduleTime, __otherCasted.lastScheduleTime);
    }
}
