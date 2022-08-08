package io.yupiik.kubernetes.bindings.v1_14_9;

import java.util.List;
import java.util.Objects;

public class EventListItemsMetadataInitializers {
    private List<EventListItemsMetadataInitializersPending> pending;
    private EventListItemsMetadataInitializersResult result;

    public EventListItemsMetadataInitializers() {
        // no-op
    }

    public EventListItemsMetadataInitializers(final List<EventListItemsMetadataInitializersPending> pending,
                                              final EventListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<EventListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<EventListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public EventListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final EventListItemsMetadataInitializersResult result) {
        this.result = result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pending,
                result);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EventListItemsMetadataInitializers)) {
            return false;
        }
        final EventListItemsMetadataInitializers __otherCasted = (EventListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
