package io.yupiik.kubernetes.bindings.v1_22_4.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop {
    private DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec;
    private DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet;
    private DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket;

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop(final DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec,
                                                                                  final DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet,
                                                                                  final DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop __otherCasted = (DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
