package io.yupiik.kubernetes.bindings.v1_9_7.v1beta1;

import io.yupiik.kubernetes.bindings.v1_9_7.Validable;
import io.yupiik.kubernetes.bindings.v1_9_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WebhookClientConfig implements Validable<WebhookClientConfig> {
    private String caBundle;
    private ServiceReference service;
    private String url;

    public WebhookClientConfig() {
        // no-op
    }

    public WebhookClientConfig(final String caBundle,
                               final ServiceReference service,
                               final String url) {
        // no-op
    }

    public String getCaBundle() {
        return caBundle;
    }

    public void setCaBundle(final String caBundle) {
        this.caBundle = caBundle;
    }

    public ServiceReference getService() {
        return service;
    }

    public void setService(final ServiceReference service) {
        this.service = service;
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
                caBundle,
                service,
                url);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof WebhookClientConfig)) {
            return false;
        }
        final WebhookClientConfig __otherCasted = (WebhookClientConfig) __other;
        return Objects.equals(caBundle, __otherCasted.caBundle) &&
            Objects.equals(service, __otherCasted.service) &&
            Objects.equals(url, __otherCasted.url);
    }

    public WebhookClientConfig caBundle(final String caBundle) {
        this.caBundle = caBundle;
        return this;
    }

    public WebhookClientConfig service(final ServiceReference service) {
        this.service = service;
        return this;
    }

    public WebhookClientConfig url(final String url) {
        this.url = url;
        return this;
    }

    @Override
    public WebhookClientConfig validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (caBundle == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "caBundle", "caBundle",
                "Missing 'caBundle' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
