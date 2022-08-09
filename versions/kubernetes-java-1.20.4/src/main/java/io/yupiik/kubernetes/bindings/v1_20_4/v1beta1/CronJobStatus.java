package io.yupiik.kubernetes.bindings.v1_20_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_20_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_20_4.Validable;
import io.yupiik.kubernetes.bindings.v1_20_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CronJobStatus implements Validable<CronJobStatus>, Exportable {
    private List<ObjectReference> active;
    private String lastScheduleTime;

    public CronJobStatus() {
        // no-op
    }

    public CronJobStatus(final List<ObjectReference> active,
                         final String lastScheduleTime) {
        // no-op
    }

    public List<ObjectReference> getActive() {
        return active;
    }

    public void setActive(final List<ObjectReference> active) {
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

    public CronJobStatus active(final List<ObjectReference> active) {
        this.active = active;
        return this;
    }

    public CronJobStatus lastScheduleTime(final String lastScheduleTime) {
        this.lastScheduleTime = lastScheduleTime;
        return this;
    }

    @Override
    public CronJobStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (active != null ? "\"active\":" + active.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (lastScheduleTime != null ? "\"lastScheduleTime\":\"" +  JsonStrings.escapeJson(lastScheduleTime) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
