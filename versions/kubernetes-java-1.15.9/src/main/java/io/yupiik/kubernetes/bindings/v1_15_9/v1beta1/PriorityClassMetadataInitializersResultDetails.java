package io.yupiik.kubernetes.bindings.v1_15_9.v1beta1;

import java.util.List;
import java.util.Objects;

public class PriorityClassMetadataInitializersResultDetails {
    private List<PriorityClassMetadataInitializersResultDetailsCauses> causes;
    private String group;
    private String kind;
    private String name;
    private Integer retryAfterSeconds;
    private String uid;

    public PriorityClassMetadataInitializersResultDetails() {
        // no-op
    }

    public PriorityClassMetadataInitializersResultDetails(final List<PriorityClassMetadataInitializersResultDetailsCauses> causes,
                                                          final String group,
                                                          final String kind,
                                                          final String name,
                                                          final Integer retryAfterSeconds,
                                                          final String uid) {
        // no-op
    }

    public List<PriorityClassMetadataInitializersResultDetailsCauses> getCauses() {
        return causes;
    }

    public void setCauses(final List<PriorityClassMetadataInitializersResultDetailsCauses> causes) {
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
        if (!(__other instanceof PriorityClassMetadataInitializersResultDetails)) {
            return false;
        }
        final PriorityClassMetadataInitializersResultDetails __otherCasted = (PriorityClassMetadataInitializersResultDetails) __other;
        return Objects.equals(causes, __otherCasted.causes) &&
            Objects.equals(group, __otherCasted.group) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(retryAfterSeconds, __otherCasted.retryAfterSeconds) &&
            Objects.equals(uid, __otherCasted.uid);
    }
}
