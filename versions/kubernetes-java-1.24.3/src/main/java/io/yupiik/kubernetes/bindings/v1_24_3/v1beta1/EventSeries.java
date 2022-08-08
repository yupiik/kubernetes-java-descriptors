package io.yupiik.kubernetes.bindings.v1_24_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_24_3.Validable;
import io.yupiik.kubernetes.bindings.v1_24_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EventSeries implements Validable<EventSeries> {
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

    public EventSeries count(final int count) {
        this.count = count;
        return this;
    }

    public EventSeries lastObservedTime(final String lastObservedTime) {
        this.lastObservedTime = lastObservedTime;
        return this;
    }

    @Override
    public EventSeries validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (lastObservedTime == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "lastObservedTime", "lastObservedTime",
                "Missing 'lastObservedTime' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
