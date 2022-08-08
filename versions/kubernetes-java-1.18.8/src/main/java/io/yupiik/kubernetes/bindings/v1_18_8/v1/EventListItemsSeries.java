package io.yupiik.kubernetes.bindings.v1_18_8.v1;

import java.util.Objects;

public class EventListItemsSeries {
    private Integer count;
    private String lastObservedTime;
    private String state;

    public EventListItemsSeries() {
        // no-op
    }

    public EventListItemsSeries(final Integer count,
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
        if (!(__other instanceof EventListItemsSeries)) {
            return false;
        }
        final EventListItemsSeries __otherCasted = (EventListItemsSeries) __other;
        return Objects.equals(count, __otherCasted.count) &&
            Objects.equals(lastObservedTime, __otherCasted.lastObservedTime) &&
            Objects.equals(state, __otherCasted.state);
    }
}
