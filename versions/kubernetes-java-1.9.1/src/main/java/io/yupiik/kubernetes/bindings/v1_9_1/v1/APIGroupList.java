package io.yupiik.kubernetes.bindings.v1_9_1.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class APIGroupList {
    private String apiVersion;
    private List<JsonValue> groups;
    private String kind;

    public APIGroupList() {
        // no-op
    }

    public APIGroupList(final String apiVersion,
                        final List<JsonValue> groups,
                        final String kind) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<JsonValue> getGroups() {
        return groups;
    }

    public void setGroups(final List<JsonValue> groups) {
        this.groups = groups;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                groups,
                kind);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof APIGroupList)) {
            return false;
        }
        final APIGroupList __otherCasted = (APIGroupList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(groups, __otherCasted.groups) &&
            Objects.equals(kind, __otherCasted.kind);
    }
}
