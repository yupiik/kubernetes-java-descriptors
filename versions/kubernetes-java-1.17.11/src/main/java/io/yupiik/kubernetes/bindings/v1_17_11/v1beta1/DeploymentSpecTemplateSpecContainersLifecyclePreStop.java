package io.yupiik.kubernetes.bindings.v1_17_11.v1beta1;

import java.util.Objects;

public class DeploymentSpecTemplateSpecContainersLifecyclePreStop {
    private DeploymentSpecTemplateSpecContainersLifecyclePreStopExec exec;
    private DeploymentSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet;
    private DeploymentSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket;

    public DeploymentSpecTemplateSpecContainersLifecyclePreStop() {
        // no-op
    }

    public DeploymentSpecTemplateSpecContainersLifecyclePreStop(final DeploymentSpecTemplateSpecContainersLifecyclePreStopExec exec,
                                                                final DeploymentSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet,
                                                                final DeploymentSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public DeploymentSpecTemplateSpecContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final DeploymentSpecTemplateSpecContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public DeploymentSpecTemplateSpecContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DeploymentSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public DeploymentSpecTemplateSpecContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DeploymentSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecContainersLifecyclePreStop)) {
            return false;
        }
        final DeploymentSpecTemplateSpecContainersLifecyclePreStop __otherCasted = (DeploymentSpecTemplateSpecContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
