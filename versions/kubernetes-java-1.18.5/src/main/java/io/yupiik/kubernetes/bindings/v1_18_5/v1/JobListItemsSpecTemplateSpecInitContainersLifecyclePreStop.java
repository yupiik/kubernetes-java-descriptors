package io.yupiik.kubernetes.bindings.v1_18_5.v1;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecInitContainersLifecyclePreStop {
    private JobListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec exec;
    private JobListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet;
    private JobListItemsSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket;

    public JobListItemsSpecTemplateSpecInitContainersLifecyclePreStop() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecInitContainersLifecyclePreStop(final JobListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec exec,
                                                                      final JobListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet,
                                                                      final JobListItemsSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public JobListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final JobListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public JobListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final JobListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public JobListItemsSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final JobListItemsSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecInitContainersLifecyclePreStop)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecInitContainersLifecyclePreStop __otherCasted = (JobListItemsSpecTemplateSpecInitContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
