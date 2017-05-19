/**
 * Copyright (c) 2015-present, Facebook, Inc. All rights reserved.
 *
 * You are hereby granted a non-exclusive, worldwide, royalty-free license to
 * use, copy, modify, and distribute this software in source code or binary
 * form for use in connection with the web services and APIs provided by
 * Facebook.
 *
 * As with any software that integrates with the Facebook platform, your use
 * of this software is subject to the Facebook Developer Principles and
 * Policies [http://developers.facebook.com/policy/]. This copyright notice
 * shall be included in all copies or substantial portions of the software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *
 */

import com.facebook.ads.sdk.*;
import java.io.File;
import java.util.Arrays;

public class SAMPLE_CODE {
  public static void main (String args[]) throws APIException {

    String access_token = "EAAEmZCsD7wZCwBAOZBZCbMNl9970Aew10emR81iAZAewmNsZC2eO0cMno14aZCWZB9joExfSoJnLORIdsErLXFmDepijOQMTeNhgMybaw35bUg4BUFMZCghZC172oWzBEZBV3lekfujgiwoD71lX2q5FtqeMe79cVZBHIsBZAjf9ZB2lCmFq1cD6UK1yHJGKZAAJMkLhezpTcWmHWycG4IZCNdQzCGyZC";
    String ad_account_id = "100748987180062";
    APIContext context = new APIContext(access_token).enableDebug(true);

    new AdAccount(ad_account_id, context).getInsights()
      .setTimeRange("{\"since\":\"2017-04-20\",\"until\":\"2017-05-20\"}")
      .setFiltering("[]")
      .setLevel(AdsInsights.EnumLevel.VALUE_ACCOUNT)
      .setBreakdowns("[\"place_page_id\"]")
      .requestField("cost_per_estimated_ad_recallers")
      .requestField("cost_per_unique_click")
      .requestField("cpc")
      .requestField("total_action_value")
      .requestField("actions:like")
      .requestField("actions:link_click")
      .requestField("actions:photo_view")
      .requestField("actions:post")
      .requestField("unique_actions:link_click")
      .requestField("cost_per_action_type:onsite_conversion.purchase")
      .requestField("cost_per_action_type:page_engagement")
      .requestField("outbound_clicks:outbound_click")
      .execute();
  }
}
