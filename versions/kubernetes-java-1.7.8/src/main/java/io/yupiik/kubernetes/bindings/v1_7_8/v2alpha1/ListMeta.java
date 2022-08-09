package io.yupiik.kubernetes.bindings.v1_7_8.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_7_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_7_8.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_7_8.Validable;
import io.yupiik.kubernetes.bindings.v1_7_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ListMeta implements Validable<ListMeta>, Exportable {
    private String resourceVersion;
    private String selfLink;

    public ListMeta() {
        // no-op
    }

    public ListMeta(final String resourceVersion,
                    final String selfLink) {
        // no-op
    }

    public String getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(final String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(final String selfLink) {
        this.selfLink = selfLink;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                resourceVersion,
                selfLink);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ListMeta)) {
            return false;
        }
        final ListMeta __otherCasted = (ListMeta) __other;
        return Objects.equals(resourceVersion, __otherCasted.resourceVersion) &&
            Objects.equals(selfLink, __otherCasted.selfLink);
    }

    public ListMeta resourceVersion(final String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public ListMeta selfLink(final String selfLink) {
        this.selfLink = selfLink;
        return this;
    }

    @Override
    public ListMeta validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (resourceVersion != null ? "\"resourceVersion\":\"" +  JsonStrings.escapeJson(resourceVersion) + "\"" : ""),
                    (selfLink != null ? "\"selfLink\":\"" +  JsonStrings.escapeJson(selfLink) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
