package io.yupiik.kubernetes.bindings.v1_8_13.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_8_13.Validable;
import io.yupiik.kubernetes.bindings.v1_8_13.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AdmissionHookClientConfig implements Validable<AdmissionHookClientConfig> {
    private String caBundle;
    private ServiceReference service;

    public AdmissionHookClientConfig() {
        // no-op
    }

    public AdmissionHookClientConfig(final String caBundle,
                                     final ServiceReference service) {
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

    @Override
    public int hashCode() {
        return Objects.hash(
                caBundle,
                service);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AdmissionHookClientConfig)) {
            return false;
        }
        final AdmissionHookClientConfig __otherCasted = (AdmissionHookClientConfig) __other;
        return Objects.equals(caBundle, __otherCasted.caBundle) &&
            Objects.equals(service, __otherCasted.service);
    }

    public AdmissionHookClientConfig caBundle(final String caBundle) {
        this.caBundle = caBundle;
        return this;
    }

    public AdmissionHookClientConfig service(final ServiceReference service) {
        this.service = service;
        return this;
    }

    @Override
    public AdmissionHookClientConfig validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (caBundle == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "caBundle", "caBundle",
                "Missing 'caBundle' attribute.", true));
        }
        if (service == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "service", "service",
                "Missing 'service' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
