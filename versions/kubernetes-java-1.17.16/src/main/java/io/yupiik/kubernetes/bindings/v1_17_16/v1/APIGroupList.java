package io.yupiik.kubernetes.bindings.v1_17_16.v1;

import io.yupiik.kubernetes.bindings.v1_17_16.Exportable;
import io.yupiik.kubernetes.bindings.v1_17_16.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_17_16.Validable;
import io.yupiik.kubernetes.bindings.v1_17_16.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class APIGroupList implements Validable<APIGroupList>, Exportable {
    private String apiVersion;
    private List<APIGroup> groups;
    private String kind;

    public APIGroupList() {
        // no-op
    }

    public APIGroupList(final String apiVersion,
                        final List<APIGroup> groups,
                        final String kind) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<APIGroup> getGroups() {
        return groups;
    }

    public void setGroups(final List<APIGroup> groups) {
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

    public APIGroupList apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public APIGroupList groups(final List<APIGroup> groups) {
        this.groups = groups;
        return this;
    }

    public APIGroupList kind(final String kind) {
        this.kind = kind;
        return this;
    }

    @Override
    public APIGroupList validate() {
        if (kind == null) {
            kind = "APIGroupList";
        }
        if (apiVersion == null) {
            apiVersion = "v1";
        }
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (groups == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "groups", "groups",
                "Missing 'groups' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (groups != null ? "\"groups\":" + groups.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
