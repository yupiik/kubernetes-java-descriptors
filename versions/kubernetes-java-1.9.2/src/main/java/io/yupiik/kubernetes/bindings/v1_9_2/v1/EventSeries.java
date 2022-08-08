package io.yupiik.kubernetes.bindings.v1_9_2.v1;

import io.yupiik.kubernetes.bindings.v1_9_2.Validable;
import io.yupiik.kubernetes.bindings.v1_9_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EventSeries implements Validable<EventSeries> {
    private Integer count;
    private String lastObservedTime;
    private String state;

    public EventSeries() {
        // no-op
    }

    public EventSeries(final Integer count,
                       final String lastObservedTime,
                       final String state) {
        // no-op
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(final Integer count) {
        this.count = count;
    }

    public String getLastObservedTime() {
        return lastObservedTime;
    }

    public void setLastObservedTime(final String lastObservedTime) {
        this.lastObservedTime = lastObservedTime;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                count,
                lastObservedTime,
                state);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EventSeries)) {
            return false;
        }
        final EventSeries __otherCasted = (EventSeries) __other;
        return Objects.equals(count, __otherCasted.count) &&
            Objects.equals(lastObservedTime, __otherCasted.lastObservedTime) &&
            Objects.equals(state, __otherCasted.state);
    }

    public EventSeries count(final Integer count) {
        this.count = count;
        return this;
    }

    public EventSeries lastObservedTime(final String lastObservedTime) {
        this.lastObservedTime = lastObservedTime;
        return this;
    }

    public EventSeries state(final String state) {
        this.state = state;
        return this;
    }

    @Override
    public EventSeries validate() {
        return this;
    }
}
