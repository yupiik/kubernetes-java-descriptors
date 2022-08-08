package io.yupiik.kubernetes.bindings.v1_14_0.v1beta2;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsMetadataInitializersResultDetails {
    private List<DaemonSetListItemsMetadataInitializersResultDetailsCauses> causes;
    private String group;
    private String kind;
    private String name;
    private Integer retryAfterSeconds;
    private String uid;

    public DaemonSetListItemsMetadataInitializersResultDetails() {
        // no-op
    }

    public DaemonSetListItemsMetadataInitializersResultDetails(final List<DaemonSetListItemsMetadataInitializersResultDetailsCauses> causes,
                                                               final String group,
                                                               final String kind,
                                                               final String name,
                                                               final Integer retryAfterSeconds,
                                                               final String uid) {
        // no-op
    }

    public List<DaemonSetListItemsMetadataInitializersResultDetailsCauses> getCauses() {
        return causes;
    }

    public void setCauses(final List<DaemonSetListItemsMetadataInitializersResultDetailsCauses> causes) {
        this.causes = causes;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(final String group) {
        this.group = group;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getRetryAfterSeconds() {
        return retryAfterSeconds;
    }

    public void setRetryAfterSeconds(final Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(final String uid) {
        this.uid = uid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                causes,
                group,
                kind,
                name,
                retryAfterSeconds,
                uid);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetListItemsMetadataInitializersResultDetails)) {
            return false;
        }
        final DaemonSetListItemsMetadataInitializersResultDetails __otherCasted = (DaemonSetListItemsMetadataInitializersResultDetails) __other;
        return Objects.equals(causes, __otherCasted.causes) &&
            Objects.equals(group, __otherCasted.group) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(retryAfterSeconds, __otherCasted.retryAfterSeconds) &&
            Objects.equals(uid, __otherCasted.uid);
    }
}
