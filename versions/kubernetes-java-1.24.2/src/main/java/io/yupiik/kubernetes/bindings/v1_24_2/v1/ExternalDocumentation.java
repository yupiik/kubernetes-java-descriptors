package io.yupiik.kubernetes.bindings.v1_24_2.v1;

import io.yupiik.kubernetes.bindings.v1_24_2.Validable;
import io.yupiik.kubernetes.bindings.v1_24_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExternalDocumentation implements Validable<ExternalDocumentation> {
    private String description;
    private String url;

    public ExternalDocumentation() {
        // no-op
    }

    public ExternalDocumentation(final String description,
                                 final String url) {
        // no-op
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                description,
                url);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ExternalDocumentation)) {
            return false;
        }
        final ExternalDocumentation __otherCasted = (ExternalDocumentation) __other;
        return Objects.equals(description, __otherCasted.description) &&
            Objects.equals(url, __otherCasted.url);
    }

    public ExternalDocumentation description(final String description) {
        this.description = description;
        return this;
    }

    public ExternalDocumentation url(final String url) {
        this.url = url;
        return this;
    }

    @Override
    public ExternalDocumentation validate() {
        return this;
    }
}
