package io.yupiik.kubernetes.bindings.v1_23_3;

import java.util.List;
import java.util.Objects;

public class EventList {
    private String apiVersion;
    private List<EventListItems> items;
    private String kind;
    private EventListMetadata metadata;

    public EventList() {
        // no-op
    }

    public EventList(final String apiVersion,
                     final List<EventListItems> items,
                     final String kind,
                     final EventListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<EventListItems> getItems() {
        return items;
    }

    public void setItems(final List<EventListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public EventListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final EventListMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                items,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EventList)) {
            return false;
        }
        final EventList __otherCasted = (EventList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
