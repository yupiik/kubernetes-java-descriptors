package io.yupiik.kubernetes.bindings.v1_17_5;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecInitContainersLifecyclePostStart {
    private JobListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec exec;
    private JobListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet;
    private JobListItemsSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket;

    public JobListItemsSpecTemplateSpecInitContainersLifecyclePostStart() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecInitContainersLifecyclePostStart(final JobListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec exec,
                                                                        final JobListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet,
                                                                        final JobListItemsSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public JobListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final JobListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public JobListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final JobListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public JobListItemsSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final JobListItemsSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                exec,
                httpGet,
                tcpSocket);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobListItemsSpecTemplateSpecInitContainersLifecyclePostStart)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecInitContainersLifecyclePostStart __otherCasted = (JobListItemsSpecTemplateSpecInitContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
