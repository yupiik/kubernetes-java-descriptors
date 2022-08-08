package io.yupiik.kubernetes.bindings.v1_15_8;

import java.util.Objects;

public class EventSeries {
    private int count;
    private String lastObservedTime;
    private String state;

    public EventSeries() {
        // no-op
    }

    public EventSeries(final int count,
                       final String lastObservedTime,
                       final String state) {
        // no-op
    }

    public int getCount() {
        return count;
    }

    public void setCount(final int count) {
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
}
