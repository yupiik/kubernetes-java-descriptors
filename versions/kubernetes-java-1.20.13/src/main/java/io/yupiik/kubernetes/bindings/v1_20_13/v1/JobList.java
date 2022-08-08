package io.yupiik.kubernetes.bindings.v1_20_13.v1;

import java.util.List;
import java.util.Objects;

public class JobList {
    private String apiVersion;
    private List<JobListItems> items;
    private String kind;
    private JobListMetadata metadata;

    public JobList() {
        // no-op
    }

    public JobList(final String apiVersion,
                   final List<JobListItems> items,
                   final String kind,
                   final JobListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<JobListItems> getItems() {
        return items;
    }

    public void setItems(final List<JobListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public JobListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final JobListMetadata metadata) {
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
        if (!(__other instanceof JobList)) {
            return false;
        }
        final JobList __otherCasted = (JobList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
