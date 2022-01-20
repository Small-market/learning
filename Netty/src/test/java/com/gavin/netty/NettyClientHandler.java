package com.gavin.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.nio.charset.StandardCharsets;

public class NettyClientHandler extends ChannelInboundHandlerAdapter {
  @Override
  public void channelActive(ChannelHandlerContext ctx) throws Exception {
    System.out.println("client " + ctx);
    ctx.writeAndFlush(Unpooled.copiedBuffer("hello this client message,server ", StandardCharsets.UTF_8));
  }

  @Override
  public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
    System.out.println("client =====" + ctx);
    ByteBuf byteBuf = (ByteBuf) msg;
    System.out.println("服务器的消息是：" + ((ByteBuf) msg).toString(StandardCharsets.UTF_8));
    System.out.println("服务器的地址是" + ctx.channel().remoteAddress());
  }

  @Override
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
    cause.printStackTrace();
    ctx.close();
  }
}