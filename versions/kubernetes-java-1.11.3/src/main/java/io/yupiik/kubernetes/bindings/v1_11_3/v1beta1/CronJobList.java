package io.yupiik.kubernetes.bindings.v1_11_3.v1beta1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class CronJobList {
    private String apiVersion;
    private List<JsonValue> items;
    private String kind;
    private CronJobListMetadata metadata;

    public CronJobList() {
        // no-op
    }

    public CronJobList(final String apiVersion,
                       final List<JsonValue> items,
                       final String kind,
                       final CronJobListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<JsonValue> getItems() {
        return items;
    }

    public void setItems(final List<JsonValue> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public CronJobListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final CronJobListMetadata metadata) {
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
        if (!(__other instanceof CronJobList)) {
            return false;
        }
        final CronJobList __otherCasted = (CronJobList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
