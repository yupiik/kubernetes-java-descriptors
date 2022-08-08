package io.yupiik.kubernetes.bindings.v1_21_0.v1beta1;

import java.util.Objects;

public class EventSeries {
    private int count;
    private String lastObservedTime;

    public EventSeries() {
        // no-op
    }

    public EventSeries(final int count,
                       final String lastObservedTime) {
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

    @Override
    public int hashCode() {
        return Objects.hash(
                count,
                lastObservedTime);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EventSeries)) {
            return false;
        }
        final EventSeries __otherCasted = (EventSeries) __other;
        return Objects.equals(count, __otherCasted.count) &&
            Objects.equals(lastObservedTime, __otherCasted.lastObservedTime);
    }
}
